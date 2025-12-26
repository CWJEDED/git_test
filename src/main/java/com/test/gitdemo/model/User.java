package com.test.gitdemo.model;

public class User {
    private Long id;
    private String username;
    private String password;
    // 本地新增phone字段
    private String phone;
      // 新增email字段（网页端修改）
    private String email;

    // 空参构造
    public User() {}


    // 补全phone的Getter/Setter
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
     // 补全email的Getter/Setter
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

