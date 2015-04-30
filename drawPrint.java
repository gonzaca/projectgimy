         final java.awt.Image image = getImageFromPanel(panel_crear_rutina);
         String fileName = "newfile.pdf";
         printToPDF(image, fileName);
                                           

    public void printToPDF(java.awt.Image awtImage, String fileName) {
        try {
            Document d = new Document();
            PdfWriter writer = PdfWriter.getInstance(d, new FileOutputStream(
                    fileName));
            d.open();

            com.itextpdf.text.Image iTextImage = com.itextpdf.text.Image.getInstance(writer, awtImage, 1);
            iTextImage.setAbsolutePosition(10, 10);
            iTextImage.scalePercent(60);
            d.add(iTextImage);

            d.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static java.awt.Image getImageFromPanel(Component component) {

        BufferedImage image = new BufferedImage(component.getWidth(),
                component.getHeight(), BufferedImage.TYPE_INT_RGB);
        component.paint(image.getGraphics());
        return image;
    }