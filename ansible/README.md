# Server Provisioning & Deployment

## Overview

You need to set up AWS authentication before running the playbooks. They presently

- Create a security group
- Launch an EC2 instance
- Add the new instance to the local inventory file
- Associate with an Elastic IP (I pre-provisioned mine externally)
- Wait for SSH to come up
- Add a PhotonService tag to the instance
 
## Pre-requisites

Put your key for accessing ec2 instances in ~/.ssh/ansible.pem
Set-up an Elastic IP for use by ec2 instances (I need to automate this bit at some point)

## Commands 

```bash
export AWS_ACCESS_KEY_ID='add yours here'
export AWS_SECRET_ACCESS_KEY='add yours here'

ansible-playbook site.yml --limit aws-infrastructure -v # will provision EC2 and Dynamo DB infrastructure
ansible-playbook site.yml --limit appservers -v # will deploy and start the application
```