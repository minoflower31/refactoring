package me.whiteship.refactoring._07_divergent_change._25_move_function.after;

public class AccountType {
    private boolean premium;

    public AccountType(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return this.premium;
    }

    /**
     * 해당 함수가 AccountType에 존재하는 이유
     * -  타입에 따라 연체료를 내는 양이 다르기 떄문
     */
    protected double overdraftCharge(int daysOverdrawn) {
        if (this.isPremium()) {
            final int baseCharge = 10;
            if (daysOverdrawn <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (daysOverdrawn - 7) * 0.85;
            }
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
