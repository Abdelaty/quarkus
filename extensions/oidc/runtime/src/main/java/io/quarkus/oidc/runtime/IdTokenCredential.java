package io.quarkus.oidc.runtime;

import io.quarkus.security.credential.TokenCredential;

public class IdTokenCredential extends TokenCredential {
    public IdTokenCredential(String token) {
        super(token, "id_token");
    }
}
