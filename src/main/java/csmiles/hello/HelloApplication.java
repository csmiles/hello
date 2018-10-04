package csmiles.hello;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloApplication extends Application<HelloConfig> {

    public static void main(String[] args) throws Exception {
        new HelloApplication().run(args);
    }

    @Override
    public void run(HelloConfig configuration, Environment environment) throws Exception {
        environment.jersey().register(new HelloResource());
    }
}
