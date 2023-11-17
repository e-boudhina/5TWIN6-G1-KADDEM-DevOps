package com.esprit.kaddem.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Etudiant  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private  Option op;

    @Override
    public String toString() {
        return "Etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", prenomE='" + prenomE + '\'' +
                ", nomE='" + nomE + '\'' +
                ", op=" + op +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Etudiant other = (Etudiant) obj;
        return Objects.equals(idEtudiant, other.idEtudiant) &&
                Objects.equals(prenomE, other.prenomE) &&
                Objects.equals(nomE, other.nomE) &&
                op == other.op;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEtudiant, prenomE, nomE, op);
    }

    public Etudiant() {
    }

    public Etudiant( String prenomE, String nomE, Option op) {
        this.prenomE = prenomE;
        this.nomE = nomE;
        this.op = op;
    }

    public Integer getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Option getOp() {
        return op;
    }

    public void setOp(Option op) {
        this.op = op;
    }

}
