package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "<h1>Welcome to MSP OpenShift Offering</h1>"
                + "<p>MSP OpenShift offers a scalable and secure container platform for deploying, managing, and scaling applications.</p>"
                + "<p>With MSP OpenShift, you can easily deploy your applications using containerized environments, enabling faster development cycles and smoother deployments.</p>"
                + "<h2>Key Features:</h2>"
                + "<ul>"
                + "<li>Container Orchestration: MSP OpenShift provides powerful container orchestration capabilities with Kubernetes, allowing you to automate the deployment, scaling, and management of containerized applications.</li>"
                + "<li>Security: Built-in security features ensure that your applications and data are protected at every level. MSP OpenShift offers role-based access control (RBAC), network policies, and container runtime security to safeguard your applications.</li>"
                + "<li>Developer Productivity: MSP OpenShift streamlines the development process with integrated development environments (IDEs), continuous integration/continuous deployment (CI/CD) pipelines, and support for various programming languages and frameworks.</li>"
                + "<li>Scalability: Easily scale your applications up or down based on demand with MSP OpenShift's elastic scaling capabilities. Handle traffic spikes effortlessly while maintaining high availability and performance.</li>"
                + "<li>Monitoring and Logging: Gain insights into your applications' health and performance through built-in monitoring and logging tools. MSP OpenShift provides metrics, logs, and alerts to help you troubleshoot issues and optimize performance.</li>";
        
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
