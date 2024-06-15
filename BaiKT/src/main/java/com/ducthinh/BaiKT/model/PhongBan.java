package com.ducthinh.BaiKT.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phong_ban")
public class PhongBan {
    @Id
    @Column(length = 2, nullable = false)
    private String maPhong;

    @Column(length = 30, nullable = false)
    private String tenPhong;
}
