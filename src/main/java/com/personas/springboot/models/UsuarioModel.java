package com.personas.springboot.models;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name = "personas")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private Integer codigo;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private String username;
    private String password;
    private Integer identificacion;

    @JoinColumn(name = "codigo_tipo_identificacion",referencedColumnName = "id",nullable = false, updatable = true)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private IdentificacionModel codigo_tipo_identificacion;

    @JoinColumn(name = "codigo_estado",referencedColumnName = "id",nullable = false, updatable = true)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EstadoModel codigo_estado;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }
    public IdentificacionModel getCodigo_tipo_identificacion() {
        return codigo_tipo_identificacion;
    }
    public void setCodigo_tipo_identificacion(IdentificacionModel codigo_tipo_identificacion) {
        this.codigo_tipo_identificacion = codigo_tipo_identificacion;
    }
    public EstadoModel getCodigo_estado() {
        return codigo_estado;
    }
    public void setCodigo_estado(EstadoModel codigo_estado) {
        this.codigo_estado = codigo_estado;
    }
}
