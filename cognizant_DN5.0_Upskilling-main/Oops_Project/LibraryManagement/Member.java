package librarymanagement;

public class Member {

    private int memberId;
    private String memberName;

    // Constructor
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    // Getters
    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    // Display Member Details
    public void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
    }
}