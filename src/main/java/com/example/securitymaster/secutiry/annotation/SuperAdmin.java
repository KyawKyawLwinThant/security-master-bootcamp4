package com.example.securitymaster.secutiry.annotation;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.example.securitymaster.secutiry.SecurityRoles.ROLES_ADMIN;
import static com.example.securitymaster.secutiry.SecurityRoles.ROLES_PREFIX;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLES_PREFIX + ROLES_ADMIN)
public @interface SuperAdmin {
}
