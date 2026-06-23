# Java Swing Training

Projet pédagogique pour apprendre les bases de **Java Swing**, le framework d'interface graphique de Java.  
Chaque exemple est abondamment commenté pour expliquer les concepts aux débutants.

---

## Prérequis

- **Java 17+** : `java -version`
- **Maven 3.6+** : `mvn -version`

---

## Structure du projet

```
javaSwingTraining/
├── pom.xml                          ← Configuration Maven
└── src/main/java/com/swingtraining/examples/
    ├── Ex01_PremiereFenetre.java    ← Créer une fenêtre (JFrame)
    ├── Ex02_BoutonsEtEvenements.java← Boutons et gestion des clics
    ├── Ex03_NavigationEntreEcrans.java ← Passer d'un écran à l'autre (CardLayout)
    ├── Ex04_MiseEnPage.java         ← Les Layout Managers (BorderLayout, GridLayout…)
    ├── Ex05_Composants.java         ← Composants courants (champs, cases, sliders…)
    └── Ex06_DialoguesEtPopups.java  ← Pop-ups et fenêtres secondaires
```

---

## Lancer un exemple

### Depuis votre IDE (recommandé pour débutants)

Ouvrez le projet dans IntelliJ IDEA ou Eclipse, puis cliquez sur le bouton **Run** de la classe souhaitée.

### Depuis le terminal

```bash
# Compiler le projet
mvn compile

# Lancer un exemple directement avec Maven
mvn exec:java -Dexec.mainClass="com.swingtraining.examples.Ex01_PremiereFenetre"
mvn exec:java -Dexec.mainClass="com.swingtraining.examples.Ex02_BoutonsEtEvenements"
mvn exec:java -Dexec.mainClass="com.swingtraining.examples.Ex03_NavigationEntreEcrans"
mvn exec:java -Dexec.mainClass="com.swingtraining.examples.Ex04_MiseEnPage"
mvn exec:java -Dexec.mainClass="com.swingtraining.examples.Ex05_Composants"
mvn exec:java -Dexec.mainClass="com.swingtraining.examples.Ex06_DialoguesEtPopups"

# Ou créer un JAR exécutable et le lancer
mvn package
java -jar target/java-swing-training-1.0-SNAPSHOT-jar-with-dependencies.jar
```

---

## Résumé des exemples

| Fichier | Concepts clés |
|---------|--------------|
| `Ex01` | `JFrame`, `JLabel`, `setVisible()`, `SwingUtilities.invokeLater()` |
| `Ex02` | `JButton`, `ActionListener`, lambda, couleurs et polices |
| `Ex03` | `CardLayout`, `JPanel`, navigation entre écrans, `JOptionPane` |
| `Ex04` | `BorderLayout`, `GridLayout`, `BoxLayout`, imbrication de panels |
| `Ex05` | `JTextField`, `JTextArea`, `JCheckBox`, `JRadioButton`, `ButtonGroup`, `JComboBox`, `JSlider`, `JSpinner` |
| `Ex06` | `JOptionPane` (message, confirm, input), `JFileChooser`, `JColorChooser`, `JDialog` |

---

## Conseils pour débuter

1. **Lisez les commentaires** dans le code — ils expliquent le *pourquoi*, pas seulement le *quoi*.
2. **Modifiez les valeurs** (couleurs, tailles, textes) pour voir l'effet immédiatement.
3. **Respectez le thread EDT** : toujours créer les composants Swing dans `SwingUtilities.invokeLater()`.
4. **Utilisez un IDE** : IntelliJ IDEA Community Edition est gratuit et idéal pour Java.
