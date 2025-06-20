package by.waitaty;

public class InvalidTwitchAccessTokenResponseScopeException
    extends RuntimeException {

    public InvalidTwitchAccessTokenResponseScopeException() {
        super("Invalid \"scope\" provided in Twitch access token response.");
    }
}
