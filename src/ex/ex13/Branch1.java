package ex.ex13;


import java.util.HashMap;
import java.util.Map;

class Branch1 {
    private String name;
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    {
        employeeMap.put(1,new Employee(1,"岡村","女",16));
        employeeMap.put(2,new Employee(2,"北川","男",17));
        employeeMap.put(3,new Employee(3,"山崎","女",15));

        initSales(employeeMap.get(1),100);
        initSales(employeeMap.get(2),300);
        initSales(employeeMap.get(3),200);
    }

    public static void initSales(Employee employee,int value) {
        for (int i = 1; i <= 12; i++) {
            employee.setSales(i,value);
        }
    }

    public Branch1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return new HashMap<Integer, Employee>(employeeMap);
    }

    public String searchEmployee(int no) {
        if (employeeMap.containsKey(no)) {
            //発見した
            return employeeMap.get(no).toString();
        } else {
            //発見できなかった
            return no + "のメンバーは居ません";
        }
    }
}
