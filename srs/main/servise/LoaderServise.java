package servise;

import dao.DaoFail;
import dao.LoaderFail;

import servise.loader.LoaderModel;


import java.util.ArrayList;

public class LoaderServise {

        private ArrayList<LoaderModel> loader;
        private DaoFail loaderFail = new LoaderFail();

        public  LoaderServise() {
            this.loader = (ArrayList<LoaderModel>) loaderFail.readFile();
        }

        public boolean addNewLoader(LoaderModel loaderModel) {
            loader.add(loaderModel);
            ArrayList <String> convertedCollection = convertLoaderToString();
            return loaderFail.saveFile(convertedCollection, "loader");
        }



        private ArrayList<String> convertLoaderToString() {
            ArrayList<String> strings = new ArrayList<>();
            for (LoaderModel model : loader) {
                strings.add(model.getId() + "," + model.getFio() + "," + model.getAge() + "," + model.getAdminName());
            }
            return strings;
        }
    }

