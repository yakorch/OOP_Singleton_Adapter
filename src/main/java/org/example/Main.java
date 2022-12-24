package org.example;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
