package com.szilardz.travelbucketlist.security.jwt;

import org.springframework.beans.factory.annotation.Autowired;

public class JwtAuthTokenFilter {

    @Autowired
    private JwtProvider tokenProvider;

    @Override
    protected void doFilterInternal(...) {
        String jwt = getJwt(request);
        if (jwt!=null && tokenProvider.validateJwtToken(jwt)) {
            ...
        }
        filterChain.doFilter(request, response);
    }
}
