package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import member.AlreadyExistingMemberException;
import member.Member;
import member.MemberDao;
import member.RegisterRequest;
import member.RegisterService;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	private static GenericXmlApplicationContext ctx = null;

	public static void main(String[] args) throws IOException {
		ctx = new GenericXmlApplicationContext("classpath:ctx.xml");

		// TODO 작성 필요
		
		ctx.close();
	}

	private static void processNewCommand(String[] arg) {
		if (arg.length != 4) {
			printUsage();
			return;
		}
		// TODO 작성 필요
	}

	private static void processInfoCommand(String[] arg) {
		if (arg.length != 2) {
			printUsage();
			return;
		}
		// TODO 작성 필요
	}

	private static void printUsage() {
		System.out.println();
		System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
		System.out.println("명령어 사용법:");
		System.out.println("new 이메일 암호 암호확인");
		System.out.println("info 이메일");
		System.out.println();
	}
}
