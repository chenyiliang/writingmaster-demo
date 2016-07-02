package com.yicai.medialab.writingmaster.demo;

import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.util.ByteSource;
import org.junit.Before;
import org.junit.Test;

public class HashedCredentialsMatcherTest extends HashedCredentialsMatcher {
	private static final String username = "admin";
	private static final String password = "123456";

	private static final String hashAlgorithmName = "MD5";
	private static final int hashIterations = 2;
	private static final boolean storedCredentialsHexEncoded = true;

	@Before
	public void init() {
		setHashAlgorithmName(hashAlgorithmName);
		setHashIterations(hashIterations);
		setStoredCredentialsHexEncoded(storedCredentialsHexEncoded);
	}

	@Test
	public void databaseStoreTest() {
		RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
		String storedSalt = randomNumberGenerator.nextBytes().toHex();
		String storedPass = new SimpleHash(hashAlgorithmName, password, ByteSource.Util.bytes(storedSalt),
				hashIterations).toHex();
		System.out.println("StoredSalt:" + storedSalt);
		System.out.println("StoredPass:" + storedPass);
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, storedPass.toCharArray(),
				ByteSource.Util.bytes(storedSalt), new JdbcRealm().getName());
		boolean match = doCredentialsMatch(new UsernamePasswordToken(username, password), info);
		System.out.println(match);
	}
}
