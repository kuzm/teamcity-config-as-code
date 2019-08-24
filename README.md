# teamcity-config-as-code
This prototype demonstrates how to use TeamCity DSL for build configurations

## Setup

First, run TeamCity server and agents:
```
docker-compose up
```

Then go to TeamCity Web UI: http://localhost:18111. It will show a wizard 
which will guide you through an initial configuration. While following 
the wizard steps, it will asks to create an account. For simplicity, enter 
the following credentials:
  - user name: admin
  - password: password

Once you see TeamCity Home page, go to Agents page and authorize an agent. 

Now you are ready to create a new project. Go to Administration and click 
"Create project". It will prompt you to select the source. Choose "GitHub". 
Read instructions on the page and find "register TeamCity" link. 
After you registered TeamCity on GitHub, go back to TeamCity. Click 
"Sign in to GitHub" to authorize TeamCity. Finally, choose `teamcity-config-as-code` 
repo as your project's repo. 
