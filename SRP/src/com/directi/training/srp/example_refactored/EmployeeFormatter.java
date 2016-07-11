package com.directi.training.srp.example_refactored;

public class EmployeeFormatter
{
    private final Employee _employee;

    public EmployeeFormatter(Employee employee)
    {
        _employee = employee;
    }

    public String toHtml()
    {
        String str = "<div>" +
                     "<h1>Employee Info</h1>" +
                     "<div id='emp" + _employee.getEmpId() + "'>" +
                     "<span>" + _employee.getName() + "</span>" +
                     "<div class='left'>" +
                     "<span>Leaves Left :</span>" +
                     "<span>Annual salary:</span>" +
                     "<span>Manager:</span>" +
                     "<span>Reimbursable leaves:</span>" +
                     "</div>";
        str += "<div class='right'><span>" + (_employee.getLeavesLeft()) + "</span>";
        str += "<span>" + Math.round(_employee.getAnnualSalary() * 12) + "</span>";
        str += "<span>" + formatManager(_employee.getManager()) + "</span>";
        str += "<span>" + _employee.getTotalLeavesLeftPreviously() + "</span>";
        return str + "</div> </div>";
    }

    public String formatManager(String manager)
    {
        return (manager != null) ? manager : "None";
    }
}
