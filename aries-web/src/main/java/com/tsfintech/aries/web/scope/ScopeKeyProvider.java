package com.tsfintech.aries.web.scope;

import org.springframework.stereotype.Component;

import com.tsfintech.rest.core.scope.EntityScopeKeyProvider;

@Component
public class ScopeKeyProvider implements EntityScopeKeyProvider {
    @Override
    public String getScopeKey(Class<?> entityClass) {
        return "lowerOrgId";
    }
}
