package homework_2;

import homework_2.controller.SalesRepresentativeController;

public class main {

    public static void main(String[] args) {

        SalesRepresentativeController SalesRepresentativeController = new SalesRepresentativeController();
        SalesRepresentativeController.populate_salesRepresentative_list();
        SalesRepresentativeController.BubbleSort();
        SalesRepresentativeController.print_list();

    }
}
