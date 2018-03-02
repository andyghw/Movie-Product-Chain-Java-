/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Sponsor.ManagerWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author HH
 */
public class SponsorManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,Enterprise enterprise) {
        return new ManagerWorkAreaJPanel(userProcessContainer,business,account,organization,enterprise);
    }
}
