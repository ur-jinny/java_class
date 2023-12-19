package ch11_classes.ex03_member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    public List<MemberDTO> findAll() {
        return memberDTOList;
    }

    public boolean update(String loginEmail, String mobile) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(mobile);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(String loginEmail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                // 중복되는 이메일이 있다 => 결과를 false로 주자
                result = false;
            }
        }
        return result;
    }
}
