package spring;

public class MemberInfoPrint {

	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	public void setMemberPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			System.out.println("일치하는 회원 정보를 조회할 수 없습니다.");
			return;
		} else {
			printer.print(member);
		}
	}
}
