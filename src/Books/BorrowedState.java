package Books;

import Users.User;

public class BorrowedState  implements BookState {
        private User borrower;

        public BorrowedState(User borrower) {
            this.borrower = borrower;
        }
        public boolean isBorrowed() {
            return true;
    }
    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }}
