package db;

import java.util.HashMap;
import java.util.Map;

import member.Member;

public class MemberDB {

	private long nextId = 1;
	private Map<Long, Member> map = new HashMap<>();

	public Member selectByEmail(String email) {
		// TODO 작성 필요
		return null;
	}
	
	public void insert(Member m) {
		// TODO 작성 필요
	}
	
	public int update(Member m) {
		// TODO 작성 필요
		return 1;
	}
	
	public void delete() {
		// TODO 작성 필요
	}

	private static MemberDB instance = new MemberDB();
	public static MemberDB instance() {
		return instance;
	}
}
