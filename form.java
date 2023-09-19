import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulaire de connexion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200); // Ajustez la taille du formulaire

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Marge autour des composants

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Nom : "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextField nameField = new JTextField(15);
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Email : "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JTextField emailField = new JTextField(15);
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Téléphone : "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        JTextField phoneField = new JTextField(15);
        panel.add(phoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Mot de passe : "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        JPasswordField passwordField = new JPasswordField(15);
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2; // Permet d'étendre le bouton sur 2 colonnes
        JButton submitButton = new JButton("Se connecter");
        panel.add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                System.out.println("Nom: " + name);
                System.out.println("Email: " + email);
                System.out.println("Téléphone: " + phone);
                System.out.println("Mot de passe: " + password);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
