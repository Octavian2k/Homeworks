package homework_2.controller;

import homework_2.domain.SalesRepresentative;

public class SalesRepresentativeController {

    private SalesRepresentative[] reps;

    //This will sort a list of SalesRepresentative
    public void BubbleSort(){
        int n = reps.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (compute_total_dividents(reps[j]) < compute_total_dividents(reps[j+1]))
                {
                    SalesRepresentative temp = reps[j];
                    reps[j] = reps[j+1];
                    reps[j+1] = temp;
                }
    }

    //This will print a list of SalesRepresentative
    public void print_list(){
        for (SalesRepresentative sr: reps)
            System.out.println(sr + " $" + compute_total_dividents(sr));
    }

    //This function will compute the total amount of sales revenue for a SaleRepresentative
    private int compute_total_dividents(SalesRepresentative sr){
        return sr.getDividentPerSale()*sr.getNumberOfsales();
    }

    //This function will populate a list of SalesRepresentative
    public void populate_salesRepresentative_list() {
        SalesRepresentative sr1 = new SalesRepresentative(5, 200);
        SalesRepresentative sr2 = new SalesRepresentative(2, 40);
        SalesRepresentative sr3 = new SalesRepresentative(3, 250);
        SalesRepresentative sr4 = new SalesRepresentative(16, 900);
        SalesRepresentative sr5 = new SalesRepresentative(2, 5);
        SalesRepresentative sr6 = new SalesRepresentative(19, 315);
        SalesRepresentative sr7 = new SalesRepresentative(7, 290);

        reps = new SalesRepresentative[]{sr1, sr2, sr3, sr4, sr5, sr6, sr7};
    }
}
