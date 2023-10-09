package homeworks.employeemanagement;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size;

    public void add(Company company) {
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
    }

    private void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, companies.length);
        companies = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }

    public Company getById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getId().equals(companyId)) {
                return companies[i];
            }
        }
        return null;
    }

    public void deleteById(String companyID) {
        int indexById = getIndexById(companyID);
        if (indexById == -1) {
            System.out.println("Company does not exists!");
            return;
        }
        for (int i = 0; i < indexById; i++) {
            companies[i - 1] = companies[i];
        }
        size--;
    }

    private int getIndexById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getId().equals(companyId)) {
                return i;
            }
        }
        return -1;
    }
}