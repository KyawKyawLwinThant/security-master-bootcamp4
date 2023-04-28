package com.example.securitymaster.secutiry.annotation.employees;


import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.example.securitymaster.secutiry.SecurityRoles.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Secured({ROLES_PREFIX+EMPLOYEES_CREATE})
public @interface EmployeesCreate {
}
