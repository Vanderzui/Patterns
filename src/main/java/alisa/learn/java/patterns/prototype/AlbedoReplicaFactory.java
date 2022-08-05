package alisa.learn.java.patterns.prototype;

public class AlbedoReplicaFactory {

    private Albedo albedo;

    public AlbedoReplicaFactory(Albedo albedo) {
        this.albedo = albedo;
    }

    Albedo createReplica() {
        return (Albedo) albedo.clone();
    }

}
