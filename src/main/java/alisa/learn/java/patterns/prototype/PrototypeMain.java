package alisa.learn.java.patterns.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrototypeMain {

    public static void main(String[] args) {
        Albedo albedo = new Albedo("Albedo", "Geo");
        log.info(albedo.toString());

        AlbedoReplicaFactory factory = new AlbedoReplicaFactory(albedo);
        Albedo albedo1 = factory.createReplica();
        log.info(albedo1.toString());

        albedo1.setElement("Cryo");
        log.info("Clone albedo changed element" + albedo1);
        log.info("Original albedo" + albedo);

        albedo.setName("Good albedo");

        log.info("Clone albedo" + albedo1);
        log.info("Original albedo changed name" + albedo);


    }

}
