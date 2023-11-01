package homeworks.onlineshop;

import homeworks.onlineshop.command.Command;
import homeworks.onlineshop.exception.LoginFailedException;
import homeworks.onlineshop.exception.NotFoundException;
import homeworks.onlineshop.model.*;
import homeworks.onlineshop.storage.OrderStorage;
import homeworks.onlineshop.storage.ProductStorage;
import homeworks.onlineshop.storage.UserStorage;
import homeworks.onlineshop.model.OrderType;

import java.text.ParseException;
import java.util.Scanner;
import java.util.UUID;
import java.util.Date;

public class OnlineShopMain implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static OrderStorage orderStorage = new OrderStorage();
    private static Date orderDate = new Date();
    private static ProductStorage productStorage = new ProductStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;

    public static void main(String[] args) throws NotFoundException, ParseException, LoginFailedException {
        boolean isRun = true;

        while (isRun) {
            Command.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    try {
                        login();
                    } catch (LoginFailedException e) {
                        System.out.println("Login Failed!");
                    }
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command. Please, try again.");
            }
        }
    }

    private static void userCommands() throws NotFoundException {
        boolean isRun = true;
        while (isRun) {
            Command.printUserLoginCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    currentUser = null;
                    break;
                case PRINT_ALL_PRODUCTS:
                    printAllProducts();
                    break;
                case BUY_PRODUCT:
                    buyProduct();
                    break;
                case PRINT_MY_ORDERS:
                    printMyOrders();
                    break;
                case CANCEL_ORDER_BY_ID:
                    cancelOrderById();
                    break;
                default:
                    System.out.println("Invalid command. Please, try again.");
            }
        }
    }

    private static void cancelOrderById() throws NotFoundException {
        if (currentUser == null) {
            System.out.println("You must be logged in to cancel an order.");
            return;
        }

        System.out.print("Enter the order ID to cancel: ");
        String orderId = scanner.nextLine();
        try {
            Order orderToCancel = orderStorage.getOrderById(orderId);
            if (orderToCancel.getUser().getId().equals(currentUser.getId())) {
                if (orderToCancel.getOrderType() == OrderType.NEW) {
                    orderStorage.removeOrderById(orderId);
                    System.out.println("Order with ID " + orderId + " has been canceled.");
                } else {
                    System.out.println("You can only cancel orders in the NEW status.");
                }
            } else {
                System.out.println("You can only cancel your own orders.");
            }
        } catch (NotFoundException e) {
            System.out.println("Order with ID " + orderId + " not found.");
        }
    }

    private static void printMyOrders() {
        if (currentUser == null) {
            System.out.println("You must be logged in to view your orders.");
        } else {
            System.out.println("Your Orders:");
            orderStorage.printOrdersByUser(currentUser);
        }
    }

    private static void buyProduct() throws NotFoundException {
        System.out.print("Enter the product ID you want to buy: ");
        String productId = scanner.nextLine();
        Product product = productStorage.getProductById(productId);
        if (product == null) {
            System.out.println("Product not found with ID: " + productId);
            return;
        }
        System.out.print("Enter the quantity you want to buy: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        double totalPrice = product.getPrice() * quantity;
        System.out.println("You want to buy the following product:");
        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.print("Enter 'YES' to confirm: ");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("YES")) {
            if (quantity > product.getStockQty()) {
                System.out.println("Sorry, the product is out of stock.");
            } else {
                User currentUser = getCurrentUser();
                Order newOrder = new Order(UUID.randomUUID().toString(), currentUser, product, orderDate, totalPrice, quantity, OrderType.NEW);
                orderStorage.addOrder(newOrder);
                System.out.println("Order placed successfully!");
            }
        } else {
            System.out.println("Order was not confirmed.");
        }
    }

    private static void printAllProducts() {
        productStorage.printProducts();
    }

    private static void adminCommands() throws NotFoundException, ParseException {
        boolean isRun = true;
        while (isRun) {
            Command.printAdminLoginCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case ADD_PRODUCT:
                    addProduct();
                    break;
                case REMOVE_PRODUCT_BY_ID:
                    removeProductById();
                    break;
                case PRINT_PRODUCTS:
                    printProducts();
                    break;
                case PRINT_USERS:
                    printUsers();
                    break;
                case PRINT_ORDERS:
                    printOrders();
                    break;
                case CHANGE_ORDERS_STATUS:
                    changeOrdersStatus();
                    break;
                default:
                    System.out.println("Invalid command. Please, try again.");
            }
        }
    }

    private static void changeOrdersStatus() throws NotFoundException {
        System.out.print("Enter the order ID to change its status: ");
        System.out.println("---------------------------------------");
        String orderId = scanner.nextLine();
        Order order = orderStorage.getOrderById(orderId);
        if (order != null) {
            System.out.print("Enter the new status (0 - for NEW, 1 - for DELIVERED, 2 - for CANCELED): ");
            int newStatusChoice = Integer.parseInt(scanner.nextLine());
            if (newStatusChoice == 1) {
                if (order.getOrderType() == OrderType.DELIVERED) {
                    System.out.println("The order is already DELIVERED.");
                } else {
                    order.setType(OrderType.DELIVERED);
                    Product product = order.getProduct();
                    int withdrawnQty = order.getQty();
                    product.setStockQty(product.getStockQty() - withdrawnQty);
                    System.out.println("Order status changed to DELIVERED, and quantity withdrawn from the product.");
                }
            } else if (newStatusChoice == 2) {
                order.setType(OrderType.CANCELED);
                System.out.println("Order status changed to CANCELED.");
            } else {
                System.out.println("Invalid status choice. Status remains unchanged.");
            }
        } else {
            System.out.println("Order not found with ID: " + orderId);
        }
    }

    private static void printOrders() {
        orderStorage.printOrders();
    }

    private static void printProducts() {
        productStorage.printProducts();
    }

    private static void printUsers() {
        userStorage.printUsers();
    }

    private static void addProduct() throws ParseException {
        System.out.println("Adding a New Product.");
        System.out.println("----------------------");
        System.out.println("Please provide the following product information:");
        System.out.println("Product ID: ");
        String id = scanner.nextLine();
        System.out.println("Product name: ");
        String name = scanner.nextLine();
        System.out.println("Description: ");
        String description = scanner.nextLine();
        double price;
        int stockQty;
        System.out.println("Price: ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.println("Stock Quantity: ");
        stockQty = Integer.parseInt(scanner.nextLine());
        System.out.println("Select Product Type:");
        System.out.println("0 - ELECTRONICS");
        System.out.println("1 - CLOTHING");
        System.out.println("2 - BOOKS");
        int productTypeChoice = Integer.parseInt(scanner.nextLine());
        ProductType productType;
        if (productTypeChoice >= 0 && productTypeChoice < ProductType.values().length) {
            productType = ProductType.values()[productTypeChoice];
        } else {
            System.out.println("Invalid product type choice.");
            return;
        }
        Product newProduct = new Product(name, description, price, stockQty, productType);
        productStorage.addProduct(newProduct);
        System.out.println(" System.out.println(Product added successfully!");
    }

    private static void removeProductById() {
        System.out.print("Please product the product ID to remove: ");
        productStorage.printProducts();
        String productId = scanner.nextLine();
        Product productById = null;
        try {
            productById = productStorage.getProductById(productId);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        if (productById != null) {
            try {
                productStorage.removeProductById(productId);
            } catch (NotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Data deleted from database.");
        } else {
            System.out.println("Product with " + productId + " does not exist");
        }
    }

    private static void login() throws NotFoundException, ParseException, LoginFailedException {
        System.out.println("Please input email: ");
        String email = scanner.nextLine();
        System.out.println("Please input password: ");
        String password = scanner.nextLine();
        User currentUser = userStorage.getUserByEmailAndPassword(email, password);
        if (currentUser != null) {
            System.out.println("Login successful. Welcome, " + currentUser.getName() + "!");
        } else {
            throw new LoginFailedException("Invalid email or password. Login failed.");
        }
        System.out.println("Please choose your user type (0 - for USER, 1 - for ADMIN):");
        int userTypeChoice = Integer.parseInt(scanner.nextLine());
        UserType userType = (userTypeChoice == 1) ? UserType.ADMIN : UserType.USER;
        if (userType == UserType.ADMIN) {
            adminCommands();
        } else {
            userCommands();
        }
    }

    private static void register() {
        System.out.println("Welcome to user registration. Please provide the following information.");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Please input user id: ");
        String id = scanner.nextLine();
        System.out.println("Please input user name: ");
        String name = scanner.nextLine();
        System.out.println("Please input user email: ");
        String email = scanner.nextLine();
        if (userStorage.thisEmailBusy(email)) {
            System.out.println("Email is already registered. Please choose a different email.");
            return;
        }
        System.out.println("Please input user password: ");
        String password = scanner.nextLine();
        System.out.println("Please choose your user type: ");
        System.out.println("0 - USER");
        System.out.println("1 - ADMIN");
        int userTypeChoice = Integer.parseInt(scanner.nextLine());
        if (userTypeChoice == 0) {
            UserType userType = UserType.USER;
        } else if (userTypeChoice == 1) {
            UserType userType = UserType.ADMIN;
        } else {
            System.out.println("Invalid user type choice. Registration failed.");
            return;
        }
        User newUser = new User(id, name, email, password);
        newUser.setUser(currentUser);
        userStorage.addUser(newUser);
        System.out.println("Registration successful. Welcome, " + newUser.getName() + "!");
    }

    private static User getCurrentUser() {
        return currentUser;
    }
}