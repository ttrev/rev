package com.revature.models;

public class ReimbursementStatuses {


    private String status_id;
    private String status;

    public ReimbursementStatuses() {
        super();
    }

    public ReimbursementStatuses(String status_id, String status) {
        this.status_id = status_id;
        this.status = status;
    }

    public String getStatusId() {
        return status_id;
    }

    public void setStatusId(String status_id) {
        this.status_id = status_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "reimbursementStatuses{" +
                "status_id='" + status_id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}