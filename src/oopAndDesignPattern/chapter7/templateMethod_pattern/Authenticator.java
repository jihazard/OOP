package oopAndDesignPattern.chapter7.templateMethod_pattern;

public abstract class Authenticator {

    public Auth authenticate(String id ,String pw) {
         if(!doAuthenticate(id,pw)) throw createException();

         return createAuth(id);
        }

        protected abstract boolean doAuthenticate(String id , String pw);
        private RuntimeException createException() {
            try {
                throw new AuthException();
            } catch (AuthException e) {
                e.printStackTrace();
            }
            return new RuntimeException();
        }

        protected  abstract Auth createAuth(String id);
}
