package com.example.securitymaster.secutiry.config;

import com.example.securitymaster.secutiry.util.RolesHierarchyBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

import static com.example.securitymaster.secutiry.SecurityRoles.*;

@Configuration
public class RoleHierarchyConfig {
    @Bean
    public RoleHierarchy roleHierarchy(){

        RoleHierarchyImpl roleHierarchy=new RoleHierarchyImpl();
        roleHierarchy.setHierarchy(new RolesHierarchyBuilder()

                        .append(ROLES_ADMIN,CUSTOMERS_ADMIN)
                        .append(CUSTOMERS_ADMIN,CUSTOMERS_READ)
                        .append(CUSTOMERS_ADMIN,CUSTOMERS_CREATE)
                        .append(CUSTOMERS_ADMIN,CUSTOMERS_DELETE)

                        .append(ROLES_ADMIN,DEPARTMENTS_ADMIN)
                        .append(DEPARTMENTS_ADMIN,DEPARTMENTS_READ)
                        .append(DEPARTMENTS_ADMIN,DEPARTMENTS_CREATE)
                        .append(DEPARTMENTS_ADMIN,DEPARTMENTS_DELETE)

                        .append(ROLES_ADMIN,EMPLOYEES_ADMIN)
                        .append(EMPLOYEES_ADMIN,EMPLOYEES_CREATE)
                        .append(EMPLOYEES_ADMIN,EMPLOYEES_READ)
                        .append(EMPLOYEES_ADMIN,EMPLOYEES_DELETE)
                .build());
        return roleHierarchy;
    }
}
