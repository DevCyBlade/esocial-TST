import { Grid } from "@mui/material";
import { useNavigate } from "react-router-dom";
import { useOcorrenciasPaginado } from "../../api/ESocialJTServiceApi";
import DataPanel from "../../components/data/DataPanel";
import FiltroEstados from "../../components/estado/FiltroEstados";
import Page from "../../components/layout/page/Page";
import PainelOcorrencias from "../../components/ocorrencia/PainelOcorrencias";
import PageHeader from "../../components/page-header/PageHeader";
import { ERRO, PROCESSADO_COM_ERRO } from "../../shared/estados";
import {
  useListQueryParam,
  useNumericQueryParam,
  useSetParam
} from "../../shared/useQueryParam";
import Paginacao from "./Paginacao";

function EventosPage() {
  const page = useNumericQueryParam("page");
  const estados = useListQueryParam("estados");
  const navigate = useNavigate();
  const setParam = useSetParam();

  const estadosAjustado = [...estados];
  if (estados.includes(ERRO)) {
    estadosAjustado.push(PROCESSADO_COM_ERRO);
  }

  const { data: ocorrenciaPage = {}, isLoading } = useOcorrenciasPaginado(
    page,
    estadosAjustado
  );
  const { pagina = {}, contagemEstado = [] } = ocorrenciaPage;
  const { content: ocorrencias } = pagina;

  if ((pagina.totalPages > 0 && page >= pagina.totalPages) || page < 0) {
    navigate(`/?${setParam("page", 0)}`);
  }

  return (
    <Page>
      <PageHeader
        primary="Eventos"
        secondary="Nesta página é possível visualizar informações de todos eventos enviados para o eSocial"
      />
      <FiltroEstados contagemEstado={contagemEstado} />

      <DataPanel
        loading={isLoading}
        isEmpty={pagina.empty}
        emptyMessage={
          estados.length
            ? "Nenhum evento com os filtros selecionados"
            : "Nenhum evento enviado para o eSocial"
        }
        paperEmptyPanel
      >
        <Grid container justifyContent="space-between">
          <Grid item></Grid>
          <Paginacao pagina={pagina} page={page} />
        </Grid>

        <PainelOcorrencias ocorrencias={ocorrencias} />

        <Grid container justifyContent="space-between">
          <Grid item></Grid>
          <Grid item></Grid>
          <Paginacao pagina={pagina} page={page} />
        </Grid>
      </DataPanel>
    </Page>
  );
}

export default EventosPage;
