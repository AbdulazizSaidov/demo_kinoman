package uz.oltinolma.consumer.mvc.model;

public class Taxonomy {

    private Integer id;
    private String name;
    private Integer idStatus;
    private boolean hierarchical;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public boolean isHierarchical() {
        return hierarchical;
    }

    public void setHierarchical(boolean hierarchical) {
        this.hierarchical = hierarchical;
    }

    @Override
    public String toString() {
        return "Taxonomy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idStatus=" + idStatus +
                ", hierarchical=" + hierarchical +
                '}';
    }
}
