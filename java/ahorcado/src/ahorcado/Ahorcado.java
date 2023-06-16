class enviarLetra implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //String  palabraJugar = palabra.getText();

            String letra = textFieldLetra.toString();
            char letraR = letra.charAt(WIDTH);
            palabraR = palabra.toString();
            char[] vc;
            vc = palabraR.toCharArray();
            char[] ocultoC = new char[palabraR.length()];
            
            boolean existe = false;
            for (int i = 0; i <= palabraR.length()-1; i++) {
               
                    if (vc[i] == letraR){
                         ocultoC[i] = letraR;
                        oculto.setText(palabra.getText().replace(ocultoC[i], letraR));
                       
                        System.out.println(" ");
                        existe = true;
