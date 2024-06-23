import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Employee class representing employee information
class Employee {
    private String name;
    private String address;
    private String deductions;
    private String tax;
    private String overtime;
    private String attendance;
    private String payDate;
    private String paySlips;
    private String salary;

    // Constructor
    public Employee(String name, String address, String deductions, String tax, String overtime,
                    String attendance, String payDate, String paySlips, String salary) {
        this.name = name;
        this.address = address;
        this.deductions = deductions;
        this.tax = tax;
        this.overtime = overtime;
        this.attendance = attendance;
        this.payDate = payDate;
        this.paySlips = paySlips;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDeductions() {
        return deductions;
    }

    public String getTax() {
        return tax;
    }

    public String getOvertime() {
        return overtime;
    }

    public String getAttendance() {
        return attendance;
    }

    public String getPayDate() {
        return payDate;
    }

    public String getPaySlips() {
        return paySlips;
    }

    public String getSalary() {
        return salary;
    }

    // Setters (if needed)
    // Methods to update employee information can be added as needed
}

// Main GUI class
public class EmployeeInformationGUI extends JFrame {
    private Employee employee;

    // GUI components
    private JLabel nameLabel;
    private JLabel addressLabel;
    private JLabel deductionsLabel;
    private JLabel taxLabel;
    private JLabel overtimeLabel;
    private JLabel attendanceLabel;
    private JLabel payDateLabel;
    private JLabel paySlipsLabel;
    private JLabel salaryLabel;

    private JTextField nameField;
    private JTextField addressField;
    private JTextField deductionsField;
    private JTextField taxField;
    private JTextField overtimeField;
    private JTextField attendanceField;
    private JTextField payDateField;
    private JTextField paySlipsField;
    private JTextField salaryField;

    // Constructor
    public EmployeeInformationGUI(Employee employee) {
        this.employee = employee;
        initialize();
    }

    // Method to initialize GUI components
    private void initialize() {
        setTitle("Employee Information");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2, 10, 10));

        nameLabel = new JLabel("Employee Name:");
        nameField = new JTextField(employee.getName());
        nameField.setEditable(false);

        addressLabel = new JLabel("Address:");
        addressField = new JTextField(employee.getAddress());
        addressField.setEditable(false);

        deductionsLabel = new JLabel("Deductions:");
        deductionsField = new JTextField(employee.getDeductions());
        deductionsField.setEditable(false);

        taxLabel = new JLabel("Tax:");
        taxField = new JTextField(employee.getTax());
        taxField.setEditable(false);

        overtimeLabel = new JLabel("Overtime:");
        overtimeField = new JTextField(employee.getOvertime());
        overtimeField.setEditable(false);

        attendanceLabel = new JLabel("Attendance:");
        attendanceField = new JTextField(employee.getAttendance());
        attendanceField.setEditable(false);

        payDateLabel = new JLabel("Pay Date:");
        payDateField = new JTextField(employee.getPayDate());
        payDateField.setEditable(false);

        paySlipsLabel = new JLabel("Pay Slips:");
        paySlipsField = new JTextField(employee.getPaySlips());
        paySlipsField.setEditable(false);

        salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(employee.getSalary());
        salaryField.setEditable(false);

        // Add components to panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(deductionsLabel);
        panel.add(deductionsField);
        panel.add(taxLabel);
        panel.add(taxField);
        panel.add(overtimeLabel);
        panel.add(overtimeField);
        panel.add(attendanceLabel);
        panel.add(attendanceField);
        panel.add(payDateLabel);
        panel.add(payDateField);
        panel.add(paySlipsLabel);
        panel.add(paySlipsField);
        panel.add(salaryLabel);
        panel.add(salaryField);

        add(panel);
        setVisible(true);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an Employee object with sample data
        Employee emp = new Employee("John Doe", "123 Main St, Anytown", "$100", "$20", "5 hours", "Present", "June 30, 2024", "5", "$2000");

        // Create and display the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeInformationGUI(emp);
            }
        });
    }
}

