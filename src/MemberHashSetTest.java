public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1001, "이태성");
        Member member2 = new Member(1002, "이정민");
        Member member3 = new Member(1005, "정기윤");
        Member member4 = new Member(1005, "박주희");

        // 회원 추가
        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.addMember(member4);

        memberHashSet.showAllMember();

        // addMember() 메서드로 회원 추가를 했을 때 member3과 member4의 memberId가 같기 때문에 member4는 회원 추가가 되지 않는다.

        // 결과
        // 이태성 회원님의 아이디는 1001입니다.
        // 이정민 회원님의 아이디는 1002입니다.
        // 정기윤 회원님의 아이디는 1005입니다.
    }
}
