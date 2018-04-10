node {
	stage("git checkout") {
		git url: 'https://github.com/aunkang/testProject.git'
	}
	stage("maven builds") {
		withMaven(
			// Maven installation declared in the Jenkins "Global Tool Configuration"
			maven: 'M3',
			// Maven settings.xml file defined with the Jenkins Config File Provider Plugin
			// Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
			mavenSettingsConfig: 'my-maven-settings',
			mavenLocalRepo: '.repository') {
			  // Run the maven build
				"mvn clean install"
			}
	}
    stage("stage 1") {
        echo "Hello"
    }
    stage("stage 2") {
        echo "World!"
    }
}