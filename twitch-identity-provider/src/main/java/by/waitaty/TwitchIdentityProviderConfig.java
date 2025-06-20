package by.waitaty;

import org.keycloak.broker.oidc.OIDCIdentityProviderConfig;
import org.keycloak.models.IdentityProviderModel;

public class TwitchIdentityProviderConfig extends OIDCIdentityProviderConfig {

    public TwitchIdentityProviderConfig(IdentityProviderModel model) {
        super(model);
    }

    public TwitchIdentityProviderConfig() {
    }
}
