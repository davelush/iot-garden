# AWS Provisioning

You need to set up AWS authentication before running the playbooks. They presently

- Create a security group
- Launch an EC2 instance
- Add the new instance to the local inventory file
- Associate with an Elastic IP (I pre-provisioned mine externally)
- Wait for SSH to come up
- Add a PhotonService tag to the instance
 
```bash
export AWS_ACCESS_KEY_ID='add yours here'
export AWS_SECRET_ACCESS_KEY='add yours here'

ansible-playbook ec2_launch.yml
```