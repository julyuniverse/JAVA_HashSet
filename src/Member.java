public class Member {
    // 멤버 변수
    private int memberId; // 회원 아이디
    private String memberName; // 회원 이름

    // 생성자
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public boolean equals(Object obj) { // memberId가 논리적으로 같다면 물리적으로 다르더라도 같다고 설정
        if (obj instanceof Member) { // 인자로 받은 obj가 Member 타입이 맞는지 확인
            Member member = (Member) obj; // Member로 다운 캐스팅
            if (this.memberId == member.memberId) {
                return true;
            } else {
                return false;
            }
        }

        // 인자로 받은 obj가 Member 타입이 아니라면 false 반환.
        return false;
    }

    @Override
    public int hashCode() {
        // hashCode() 메서드는 요소의 주솟값을 반환하나 현재 주솟값의 기준은 memberId므로 memberId로 반환하도록 hashCode() 메서드를 오버라이딩한다.
        // return Objects.hash(memberId, memberName);
        return memberId;
    }

    @Override
    public String toString() { // toString 메서드 오버라이딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }
}
