package oopAndDesignPattern.chapter7.templateMethod_pattern;

import javax.naming.ldap.LdapContext;

public class LdapAuth extends Authenticator {
    @Override
    protected boolean doAuthenticate(String id, String pw) {
        return ldapClient.authenicate(id,pw);
    }

    @Override
    protected Auth createAuth(String id) {
        LdapContext ctx = ldapClient.find(id);
        return new Auth(id,ctx.getAttribute("name"));
    }
}
