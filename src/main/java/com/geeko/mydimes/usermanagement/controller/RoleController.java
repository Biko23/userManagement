//package com.geeko.mydimes.usermanagement.controller;
//
//import com.geeko.mydimes.usermanagement.entity.RoleEntity;
//import com.geeko.mydimes.usermanagement.service.RoleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.UUID;
//
//
//@RestController
//@RequestMapping("/api/v1/roles")
//public class RoleController {
//
//    @Autowired
//    private RoleService roleService;
//
//    @PostMapping("")
//    public ResponseEntity<?> addRole(@RequestBody RoleEntity roleEntity) {
////        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/roles/save").toUriString());
//        return new ResponseEntity<>(roleService.addRole(roleEntity), HttpStatus.CREATED);
//    }
//
//    @GetMapping("")
//    public ResponseEntity<?> findAllRoles() {
//        return new ResponseEntity<>(roleService.findAllRoles(), HttpStatus.OK);
//    }
//
//    @GetMapping("/{roleId}")
//    public ResponseEntity<?> findRoleById(@PathVariable UUID roleId) {
//        return new ResponseEntity<>(roleService.findRoleById(roleId), HttpStatus.OK);
//    }
//
//    @DeleteMapping("")
//    public void deleteAllRoles() {
//        roleService.deleteAllRoles();
//    }
//}
