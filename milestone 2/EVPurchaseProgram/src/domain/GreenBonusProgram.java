package domain;

import java.util.Arrays;

public class GreenBonusProgram {

    private int fixedBudget;
    private Purchase[] purchasesHistory;

    public GreenBonusProgram(int fixedBudget, Purchase[] purchasesHistory) {
        this.fixedBudget = fixedBudget;
        this.purchasesHistory = purchasesHistory;
    }

    public int getFixedBudget() {
        return fixedBudget;
    }

    public void setFixedBudget(int fixedBudget) {
        this.fixedBudget = fixedBudget;
    }

    public Purchase[] getPurchasesHistory() {
        return purchasesHistory;
    }

    public void setPurchasesHistory(Purchase[] purchasesHistory) {
        this.purchasesHistory = purchasesHistory;
    }

    @Override
    public String toString() {
        return "GreenBonusProgram{" +
                "fixedBudget=" + fixedBudget +
                ", purchasesHistory=" + Arrays.toString(purchasesHistory) +
                '}';
    }
}
