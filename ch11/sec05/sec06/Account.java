package src.ch11.sec05.sec06;

public class Account {
        private long balance;

        public Account() {}

        public long getBalance() {
            return balance;
        }
        public void deposit(int money) {
            balance += money;
        }
        public void withdraw(int money) throws InsufficienException {
            if (balance < money) {
                throw new InsufficienException("잔고부족 : " + (money-balance)+ "모자람");
            }
            balance -= money;
        }
    }
