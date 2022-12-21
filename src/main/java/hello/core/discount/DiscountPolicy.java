package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액을 반환한다.
     */
    int discount(Member member, int price);

}
