import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet; // HashSet 클래스는 제네릭 클래스라는 걸 알 수 있다.

    // 생성자
    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    // 생성자
    public MemberHashSet(int size) {
        hashSet = new HashSet<>(size);
    }

    // 회원 추가
    public void addMember(Member member) {
        hashSet.add(member);
    }

    // 회원 삭제
    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }

        // for 문에서 순회를 다 하고 나서도 memberId와 매핑되는 id가 없다면 제어가 여기로 오게 된다. 제어 처리를 해준다.
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 모든 회원 출력
    public void showAllMember() {
        // 향상된 for 문
        for (Member member : hashSet) {
            System.out.println(member);
        }

        System.out.println();
    }
}
