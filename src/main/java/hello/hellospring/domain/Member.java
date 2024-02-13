package hello.hellospring.domain;

public class Member {

    private Long id; //시스템이 저장하는 id
    private String name;
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
